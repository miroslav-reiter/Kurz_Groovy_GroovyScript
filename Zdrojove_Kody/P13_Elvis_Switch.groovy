// Elvis operator
/*
def kontrolujDochadzku(meno) {
    ${meno} ?: "Elvis"
}

println kontrolujDochadzku()
*/
/*
def greet(name) { 
    "${name ?: 'Elvis'} has left the building" 
}
assert greet() == 'Elvis has left the building'

assert greet(null) == 'Elvis has left the building'

assert greet('Priscilla') == 'Priscilla has left the building'
*/



switch (1) {
	case 0: 			assert false; break
	case 0..9: 			assert false; break
	case [8,9,11]: 		assert false; break
	case Float: 		assert false; break
	case { it%3 == 0 }: assert false; break
	case ~/../: 		assert true; break
	default: 			assert false
}
//...