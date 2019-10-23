(ns string-calculator.core
  (:gen-class))

(defn parse-numbers
  [numbers]
  (clojure.string/split numbers #"\,"))

(defn add
  [number]
  (if (= "" number)
    "0"
    (if (= (clojure.string/includes? number ",") true) 
      "1"
    (str number))))

