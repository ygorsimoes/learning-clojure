(ns learning.courses.segundatech.challengers.filter_reduce_map)

;; CHALLENGER (filter):
;; Create one function that takes a vector as input e return the quantity
;; of students that they are in the fifth year.

(defn student-in-fifth-year?
  "Returns true if year is equal 5, else return false"
  [year]
  (= year 5))

(defn filter-quantity-of-students-in-fifth-year
  "Returns the quantity of the students in the fifth years"
  [students]
  (count (filter student-in-fifth-year? students)))

(filter-quantity-of-students-in-fifth-year [5 5 6 7 8 6 5 5])
(filter-quantity-of-students-in-fifth-year [5 6 5 5])


;; CHALENGER (reduce):
;; CHALLENGER one function that takes a vector of ages and return the sum.

(defn reduce-summing-of-ages
  "Returns the sum of ages"
  [ages]
  (reduce + ages))

(reduce-summing-of-ages [5 10 5])


;; CHALLENGER (map)
;; Create one function that takes one vector of names and return the average
;; size of the names.

(defn map-average-size-of-the-names
  "Returns the average size of the names"
  [names]
  (let [size-vector (count names)
        sum-of-size-of-all-names (reduce + (map count names))]
    (/ sum-of-size-of-all-names size-vector)))

(map-average-size-of-the-names ["Marcio" "Gibson"])


;; CHALLENGER (final)
;; Create one function that take one vector of the name and return the average
;; size of the names, but most ignore names with three or less caracteres.

(defn less-or-equal-three?
  "Return true if less or equal three else return false"
  [number]
  (> number 3))

(defn final-average-size-of-the-names
  "Returns the average size of the names, but most ignore
  names with three or less caracteres"
  [names]
  (let [size-of-the-names (map count names)
        size-of-the-names-without-three-char (filter less-or-equal-three? size-of-the-names)
        size-vector-without-three-char (count size-of-the-names-without-three-char)
        sum-of-size-of-all-names (reduce + size-of-the-names-without-three-char)]
    (/ sum-of-size-of-all-names size-vector-without-three-char)))

(final-average-size-of-the-names ["Ana" "Marcio" "Gibson"])