(ns string-calculator.core
  (:gen-class))

(defn add
  [number]
  (if (= "" number)
    "0"
  (str number)))
