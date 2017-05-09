(ns webapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[webapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[webapp has shut down successfully]=-"))
   :middleware identity})
