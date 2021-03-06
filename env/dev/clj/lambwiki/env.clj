(ns lambwiki.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [lambwiki.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[lambwiki started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[lambwiki has shutdown successfully]=-"))
   :middleware wrap-dev})
