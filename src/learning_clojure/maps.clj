(ns learning-clojure.maps)

;; Maps are a collection of key-value pairs.
(def inventory {:potion 1
                :sword  1
                :shield 1})

;; (keys) is a function that returns a collection of keys from a map.
(keys inventory)

;; (vals) is a function that returns a collection of values from a map.
(vals inventory)

;; (get) is a function that returns a value from a map.
(get inventory :potion)

;; (contains?) is a function that returns true if a map contains a key.
(contains? inventory :potion)

;; (assoc) is a function that adds a key-value pair to a map.
(assoc inventory :potion 2)

;; (dissoc) is a function that removes a key-value pair from a map.
(dissoc inventory :potion)

;; (update) is a function that updates a value in a map.
(update inventory :potion inc)

;; (merge) is a function that merges two maps.
(merge inventory {:potion 2 :gold 100})

;; (select-keys) is a function that returns a map with only the specified keys.
(select-keys inventory [:potion :gold])

;; (zipmap) is a function that creates a map from two collections.
(zipmap [:potion :gold] [1 100])

;; (into) is a function that adds a collection of key-value pairs to a map.
(into inventory [[:potion 2] [:gold 100]])

(def inventory-complexity {:potion {:quantity 5
                                    :price    10}
                           :sword  {:quantity 1
                                    :price    200}
                           :shield {:quantity 1
                                    :price    50}})

;; (get-in) is a function that returns a value from a nested map.
(get-in inventory-complexity [:potion :quantity])

;; (assoc-in) is a function that adds a key-value pair to a nested map.
(assoc-in inventory-complexity [:potion :quantity] 10)

;; (update-in) is a function that updates a value in a nested map.
(update-in inventory-complexity [:potion :quantity] inc)

;; (select-keys) is a function that returns a map with only the specified keys.
(select-keys inventory-complexity [:potion :sword])

;; (zipmap) is a function that creates a map from two collections.
(zipmap [:potion :sword] [{:quantity 5 :price 10}
                          {:quantity 1 :price 200}])

;; Threads First:
(-> inventory-complexity
    :potion
    :quantity
    println)

(-> inventory-complexity
    (assoc-in [:potion :quantity] 11)
    (update-in [:potion :quantity] inc)
    (get-in [:potion :quantity]))


;; Threads Last:
(->> inventory-complexity
    :potion
    :quantity
    println)

(->> inventory-complexity
     :potion
     vals
     (map inc)
     vec
     println)