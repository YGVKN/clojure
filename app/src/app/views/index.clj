(ns app.views.index
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(def links
  [:div.link
   "["
   [:a {:href "/"} "main"]
   "]"])

(defn header
  [title]
  [:head
   [:title (str "Location " title)]
   (page/include-css "/css/styles.css")])

(defn index
  []
  (page/html5
    (header "main")
    links
    [:h2 "main page"]
    [:div.text "clojure web app"]))
