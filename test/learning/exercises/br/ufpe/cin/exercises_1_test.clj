(ns learning.exercises.br.ufpe.cin.exercises-1-test
  (:require [clojure.test :refer :all]
            [learning.exercises.br.ufpe.cin.exercises_1 :refer :all]))

(deftest menor-de-dois-test
  (testing "Resultado inesperado da função (menor-de-dois x y)."
    (is (= 2 (menor-de-dois 100 2)))
    (is (= 4 (menor-de-dois 44 4)))
    (is (= 0 (menor-de-dois 0 0.1)))))