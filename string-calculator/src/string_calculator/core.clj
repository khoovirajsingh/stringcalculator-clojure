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
    (str (apply + (map-to-long (parse-numbers number))))))

