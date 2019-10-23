(ns string-calculator.core
  (:gen-class))

(defn parse-numbers
  [numbers]
  (clojure.string/split numbers #"\,"))

(defn str->long
  [x]
  (Long/valueOf x))

(defn add
  [number]
  (if (= "" number)
    "0"
    (str (apply + (map str->long (parse-numbers number))))))