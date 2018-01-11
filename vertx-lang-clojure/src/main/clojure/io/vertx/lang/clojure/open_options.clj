(ns io.vertx.lang.clojure.open-options)

(import io.vertx.core.file.OpenOptions)

(defn from-json [^OpenOptions json] (new OpenOptions json))

(defn set-append [^OpenOptions open-options append] (.setAppend open-options append))
(defn is-append [^OpenOptions open-options] (.isAppend open-options))
(defn set-create [^OpenOptions open-options create] (.setCreate open-options create))
(defn is-create [^OpenOptions open-options] (.isCreate open-options))
(defn set-create-new [^OpenOptions open-options create-new] (.setCreateNew open-options create-new))
(defn is-create-new [^OpenOptions open-options] (.isCreateNew open-options))
(defn set-delete-on-close [^OpenOptions open-options delete-on-close] (.setDeleteOnClose open-options delete-on-close))
(defn is-delete-on-close [^OpenOptions open-options] (.isDeleteOnClose open-options))
(defn set-dsync [^OpenOptions open-options dsync] (.setDsync open-options dsync))
(defn is-dsync [^OpenOptions open-options] (.isDsync open-options))
(defn set-perms [^OpenOptions open-options perms] (.setPerms open-options perms))
(defn get-perms [^OpenOptions open-options] (.getPerms open-options))
(defn set-read [^OpenOptions open-options read] (.setRead open-options read))
(defn is-read [^OpenOptions open-options] (.isRead open-options))
(defn set-sparse [^OpenOptions open-options sparse] (.setSparse open-options sparse))
(defn is-sparse [^OpenOptions open-options] (.isSparse open-options))
(defn set-sync [^OpenOptions open-options sync] (.setSync open-options sync))
(defn is-sync [^OpenOptions open-options] (.isSync open-options))
(defn set-truncate-existing [^OpenOptions open-options truncate-existing] (.setTruncateExisting open-options truncate-existing))
(defn is-truncate-existing [^OpenOptions open-options] (.isTruncateExisting open-options))
(defn set-write [^OpenOptions open-options write] (.setWrite open-options write))
(defn is-write [^OpenOptions open-options] (.isWrite open-options))