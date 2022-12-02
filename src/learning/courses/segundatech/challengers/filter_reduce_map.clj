(ns learning.courses.segundatech.challengers.filter_reduce_map)

;; CHALLENGER (filter):
;; Create one function that takes a vector as input e return the quantity
;; of students that they are in the fifth year.

(defn student-in-fifth-year?
  "Returns true if year is equal 5, else return false"
  [year]
  (= year 5))

(defn quantity-of-students-in-fifth-year
  "Returns the quantity of the students in the fifth years"
  [students]
  (count (filter student-in-fifth-year? students)))

(quantity-of-students-in-fifth-year [5 5 6 7 8 6 5 5])
(quantity-of-students-in-fifth-year [5 6 5 5])


;; CHALENGER (reduce):
;; CHALLENGER one function that takes a vector of ages and return the sum.

(defn summing-of-ages
  "Returns the sum of ages"
  [ages]
  (reduce + ages))

(summing-of-ages [5 10 5])

;; CHALLENGER (map)
;; Create one function that takes one vector of names and return the average
;; size of the names.

(defn average-size-of-the-names
  "Returns the average size of the names"
  [names]
  (let [size-vector (count names)
        size-of-the-names (reduce + (map count names))]
    (/ size-of-the-names size-vector)))

(average-size-of-the-names ["Marcio" "Gibson"])
