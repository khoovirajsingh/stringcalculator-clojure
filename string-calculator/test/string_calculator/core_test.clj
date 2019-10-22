(ns string-calculator.core-test
  (:require [clojure.test :refer :all]
            [string-calculator.core :refer :all]))

(deftest test-sum-of-zero-is-zero
  (testing
    (is (= "0" (add "0")))))
