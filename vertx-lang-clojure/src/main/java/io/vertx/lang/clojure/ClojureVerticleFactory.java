package io.vertx.lang.clojure;

import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import io.vertx.core.spi.VerticleFactory;

import java.io.File;

/**
 * Clojure language wrapper verticle factory, when the verticle is generated
 * it will automatically load the corresponding Clojure namespace file
 * and load its start method, currently supports several ways of start
 * start[] start[vertx] start[vertx context] start[context] start[context vertx]
 * @author <a href="mailto:chengen.zhao@whitewoodcity.com">Chengen Zhao</a>
 */
public class ClojureVerticleFactory implements VerticleFactory {

  private Vertx vertx;

  @Override
  public String prefix() {
    return "clj";
  }

  @Override
  public boolean blockingCreate() {
    return true;
  }

  @Override
  public void init(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {

    String ns = VerticleFactory.removePrefix(verticleName);

    boolean requireCompiling = false;

    if(ns.endsWith("."+prefix())){

      ns = ns.substring(0,ns.indexOf("."+prefix()));
      //check .clj source file exists, if file exists, Clojure will try to compile it
      //and concurrently compile clojure files may cause exception, it has to be serial
      String filePath = ns.replace(".",File.separator) + "." + prefix();
      if(classLoader.getResource(filePath)!=null){
        requireCompiling = true;
      }
    }

    //change SNAKE_CASE to KEBAB_CASE since in the namespace, clojure uses Kebab case, while Snake case in file name.
    ns = ns.replace("_","-");

    return new ClojureVerticle(ns, requireCompiling);
  }

}
