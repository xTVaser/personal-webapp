(ns webapp.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [webapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[webapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[webapp has shut down successfully]=-"))
   :middleware wrap-dev})
