=begin
This is a program that plays Fizz Buzz.
Count to 100; replace numbers devisable by three with the word fizz.
Replace numbers devisable by five with the word buzz.
Numbers divisible by both become fizz buzz.
=end

for num in 1..100 do
    to_put = ''

    to_put += 'fizz '   if num%3 == 0
    to_put += 'buzz '   if num%5 == 0    
    to_put += num.to_s  if to_put == ''

    puts to_put.chomp

end