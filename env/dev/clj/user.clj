(ns user
  (:require [mount.core :as mount]
            [webapp.figwheel :refer [start-fw stop-fw cljs]]
            webapp.core))

(defn start []
  (mount/start-without #'webapp.core/repl-server))

(defn stop []
  (mount/stop-except #'webapp.core/repl-server))

(defn restart []
  (stop)
  (start))


