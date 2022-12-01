(ns learning.exercises.br.ufpe.cin.exercises-2-test
  (:require [clojure.test :refer :all]
            [learning.exercises.br.ufpe.cin.exercises_2 :refer :all]))

(deftest menor-de-tres-test
(testing "Resultado inesperado da função (menor-de-tres x y z)."
    (is (= 2 (menor-de-tres 100 2 3)))
    (is (= 4 (menor-de-tres 44 4 5)))
    (is (= 0.1 (menor-de-tres 0.1 4 5)))
    (is (= 0 (menor-de-tres 0.1 0 0)))))