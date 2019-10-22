(ns string-calculator.core-test
  (:require [clojure.test :refer :all]
            [string-calculator.core :refer :all]))

(deftest test-sum-of-zero-is-zero
  (testing
    (is (= "0" (add "0")))))

(deftest test-sum-of-empty-string-is-zero
  (testing
    (is (= "0" (add "")))))

(deftest test-sum-of-0-and-1-is-one
  (testing
   (is (= "1" (add "0,1")))))
