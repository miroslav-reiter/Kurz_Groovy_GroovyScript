package metaprogramming

import java.text.NumberFormat;

Number.metaClass.asCurrency = {
    NumberFormat nf = NumberFormat.getCurrencyInstance()
    nf.format(delegate)
} 

Number.metaClass.asCurrency = { Locale loc ->
    NumberFormat nf = NumberFormat.getCurrencyInstance(loc)
    nf.format(delegate)
}

def amount = 123456.7890
println amount
Locale.default = Locale.US

assert amount.asCurrency() == '$123,456.79'
println amount.asCurrency()