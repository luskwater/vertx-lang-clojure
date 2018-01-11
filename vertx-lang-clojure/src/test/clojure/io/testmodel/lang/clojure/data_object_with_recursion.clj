(ns io.testmodel.lang.clojure.data-object-with-recursion)

(import io.vertx.codegen.testmodel.DataObjectWithRecursion)

(defn from-json [^DataObjectWithRecursion json] (new DataObjectWithRecursion json))

(defn set-data [^DataObjectWithRecursion data-object-with-recursion data] (.setData data-object-with-recursion data))
(defn get-data [^DataObjectWithRecursion data-object-with-recursion] (.getData data-object-with-recursion))
(defn set-next [^DataObjectWithRecursion data-object-with-recursion next] (.setNext data-object-with-recursion next))
(defn get-next [^DataObjectWithRecursion data-object-with-recursion] (.getNext data-object-with-recursion))