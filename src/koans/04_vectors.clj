(ns koans.04-vectors
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can use vectors in clojure as array-like structures"
  (= 1 (count [42]))

  "You can create a vector from a list"
  (= [1] (vec '(1)))
  ;; also from maps in pair forms
  ;; also from sets
  ;; vec is used for type casting

  "Or from some elements"
  (= [nil nil] (vector nil nil))
  ;; vector is used for creation from args

  "But you can populate it with any number of elements at once"
  (= [1 2] (vec '(1 2)))

  "Conjoining to a vector is different than to a list"
  (= [111 222 333] (conj [111 222] 333))
  ;; unlike lists here we apped instead of prepend

  "You can get the first element of a vector like so"
  (= :peanut (first [:peanut :butter :and :jelly]))

  "And the last in a similar fashion"
  (= :jelly (last [:peanut :butter :and :jelly]))

  "Or any index if you wish"
  (= :jelly (nth [:peanut :butter :and :jelly] 3))
  ;; zero indexing
  "You can also slice a vector"
  (= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))
  ;; like python lists second arg is not included
  "Equality with collections is in terms of values"
  (= (list 1 2 3) (vector 1 2 3)))
  ;; not with sets
  ;; maybe saying order collections is better here
