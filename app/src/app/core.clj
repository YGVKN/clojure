(ns app.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [app.views.index :as index]
            [app.views.garden :as garden]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
 (GET "/"
  []
  (index/index))

 (GET "/css"
  []
  (garden/page))

 (route/not-found "Don't worry ,be happy,drink coffee"))

(def app
  (wrap-defaults app-routes site-defaults))
