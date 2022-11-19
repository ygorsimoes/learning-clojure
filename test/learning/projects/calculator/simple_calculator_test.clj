(ns learning.projects.calculator.simple-calculator_test
  (:require [clojure.test :refer :all]
            [learning.projects.calculator.simple-calculator :refer :all]))

(deftest operations-test
  (testing "Unexpected result from function (sum x y)."
    (is (= 2 (sum 1 1))))
  (testing "Unexpected result from function (sub x y)."
    (is (= 2 (sub 4 2))))
  (testing "Unexpected result from function (mult x y)."
    (is (= 4 (mult 2 2))))
  (testing "Unexpected result from function (div x y)."
    (is (= 2 (div 4 2)))))

(deftest calculator-test
  (testing "Unexpected result from function (calculator value-of-menu x y)."
    (is (= 30 (calculator 1 10 20)))
    (is (= -3 (calculator 2 2 5)))
    (is (= 25 (calculator 3 5 5)))
    (is (= 40 (calculator 4 200 5)))))