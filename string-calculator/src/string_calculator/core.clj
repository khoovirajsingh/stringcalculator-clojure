(ns string-calculator.core
  (:gen-class))

(defn parse-numbers
  [numbers]
  (clojure.string/split numbers #"\,"))

(defn str->long
  [x]
  (Long/valueOf x))

(defn map-to-long
  [numbers]
  (map str->long numbers))

(defn add
  [number]
  (if (= "" number)
    "0"
    (if (= (clojure.string/includes? number ",") true) 
      "1"
    (str number))))

