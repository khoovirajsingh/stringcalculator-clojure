(ns string-calculator.core
  (:gen-class))

(defn split-comma
  [numbers]
  (clojure.string/split numbers #"\,"))

(defn parse-numbers
  [numbers]
  (mapcat split-comma (clojure.string/split-lines numbers)))

(defn str->long
  [x]
  (Long/valueOf x))

(defn add
  [number]
  (if (= "" number)
    "0"
    (str (apply + (map str->long (parse-numbers number))))))