(ns io.vertx.clojure.codegen.testmodel.data-object-with-lists)

(import io.vertx.codegen.testmodel.DataObjectWithLists)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DataObjectWithLists))
  ([^JsonObject json] (new DataObjectWithLists json)))

(defn set-boolean-values [^DataObjectWithLists data-object-with-lists boolean-values] (.setBooleanValues data-object-with-lists boolean-values))
(defn set-data-object-values [^DataObjectWithLists data-object-with-lists data-object-values] (.setDataObjectValues data-object-with-lists data-object-values))
(defn set-double-values [^DataObjectWithLists data-object-with-lists double-values] (.setDoubleValues data-object-with-lists double-values))
(defn set-enum-values [^DataObjectWithLists data-object-with-lists enum-values] (.setEnumValues data-object-with-lists enum-values))
(defn set-float-values [^DataObjectWithLists data-object-with-lists float-values] (.setFloatValues data-object-with-lists float-values))
(defn set-gen-enum-values [^DataObjectWithLists data-object-with-lists gen-enum-values] (.setGenEnumValues data-object-with-lists gen-enum-values))
(defn set-integer-values [^DataObjectWithLists data-object-with-lists integer-values] (.setIntegerValues data-object-with-lists integer-values))
(defn set-json-array-values [^DataObjectWithLists data-object-with-lists json-array-values] (.setJsonArrayValues data-object-with-lists json-array-values))
(defn set-json-object-values [^DataObjectWithLists data-object-with-lists json-object-values] (.setJsonObjectValues data-object-with-lists json-object-values))
(defn set-long-values [^DataObjectWithLists data-object-with-lists long-values] (.setLongValues data-object-with-lists long-values))
(defn set-short-values [^DataObjectWithLists data-object-with-lists short-values] (.setShortValues data-object-with-lists short-values))
(defn set-string-values [^DataObjectWithLists data-object-with-lists string-values] (.setStringValues data-object-with-lists string-values))
(defn to-json [^DataObjectWithLists data-object-with-lists] (.toJson data-object-with-lists))