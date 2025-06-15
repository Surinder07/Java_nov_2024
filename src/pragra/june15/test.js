// JSON -

const person = {
  name: 'Jay',
  email: 'jay@gmail.com',
  work: function () {
    console.log('Hello I am working');
  },
};

person.work();

console.log(person.email);
console.log(person.name);

//

// const myObject = {};   another way of creating objects

const human = new Object();
human.name = 'John';
human.email = 'john@gmail.com';
human.greeting = function () {
  console.log('Hello there');
};

human.greeting();

function Student(name, age) {
  this.name = name;
  this.age = age;
  this.greeting1 = function () {
    console.log('Hi there!');
  };
}

const p1 = new Student('John', 23);
p1.greeting1();

const test = function x() {};
