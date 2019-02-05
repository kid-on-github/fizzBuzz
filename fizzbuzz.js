/*
This is a program that plays Fizz Buzz.
Count to 100; replace numbers devisable by three with the word fizz.
Replace numbers devisable by five with the word buzz.
Numbers divisible by both become fizz buzz.
*/

for (let num=1; num<=100; num++){
    let toLog = ''

    if (num%3 == 0){ toLog += 'fizz '}
    if (num%5 == 0){ toLog += 'buzz '}
    if (toLog == ''){ toLog = num }

    console.log(toLog)
}