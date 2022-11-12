(ns learning.segundatech.initial.vectors)

;; [n1 n2 n3] - basic vector
(println "basic-vector:"
         [1 2 3])

;; (count [n1, n2, n3]) - returns the total number of elements in the vector
(println "count:"
         (count [1 2 3]))

;; (conj [n1 n2 n3] x) - add the element in vector
(println "conj:"
         (conj [1 2 3] 4))

;; (pop [n1 n2 n3]) - remove last element
(println "pop:"
         (pop [1 2 3]))

;; (peek [n1 n2 n3]) - return last element
(println "peek:"
         (peek [1 2 3]))