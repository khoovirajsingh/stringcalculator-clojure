(ns string-calculator.core-test
  (:require [clojure.test :refer :all]
            [string-calculator.core :refer :all]))

(deftest test-sum-of-zero-is-zero
    (is (= "0" (add "0"))))

(deftest test-sum-of-empty-string-is-zero
    (is (= "0" (add ""))))

(deftest test-sum-of-0-and-1-is-one
   (is (= "1" (add "0,1"))))

(deftest test-parse-numbers
   (is (= ["0", "1"] (parse-numbers "0,1"))))

(deftest test-map-string-numbers-to-ints
  (is (= [0, 1] (map-to-long ["0", "1"]))))
