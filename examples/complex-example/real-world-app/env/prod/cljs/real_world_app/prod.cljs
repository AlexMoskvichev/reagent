(ns real-world-app.prod
  (:require [real-world-app.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
