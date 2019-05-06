val someNumbers = List(10,20,30,40,50,60)

someNumbers.scanRight(0)(_ - _)
someNumbers.scanLeft(0)(_ - _)
someNumbers.scan(0)(_ - _)

someNumbers.foldRight(0)(_ - _)
someNumbers.foldLeft(0)(_ - _)
someNumbers.fold(0)(_ - _)

someNumbers.reduceRight(_ - _)
someNumbers.reduceLeft(_ - _)
someNumbers.reduce(_ - _)

