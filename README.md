# Blink

Incentivizing blood donations and similar campaigns.

# Tech Stack

In this project, we use the following tools:

Backend:
* [Java](https://java.com) Programming Language
* [Quarkus](https://quarkus.io) Application Framework
* [AWS CDK](https://aws.amazon.com/cdk/) Infrastructure as Code
* [Amazon Lex](https://aws.amazon.com/pm/lex)
* [AWS Lambda](https://aws.amazon.com/lambda)

Frontend:
* [JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript) Programming Language
* [JSX + React](https://react.dev/) Web Framework
* [Vite](https://vitejs.dev/) Web tooling

# How to run this project

## Development Environment

Start a GitPod development environment at https://gitpod.io/#github.com/CaravanaCloud/blink

## Backend

* Build all modules
```
mvn install
```

* Start the API
```
mvn -f blink-api quarkus:dev
```

## Frontend
* Install dependencies
```
cd blink-app
yarn install
```

* Run the app
```
yarn run dev
```

## Accessing the Application

Navigate to http://localhost:5473


## Troubleshooting

If you find issues, check [DEBUG.md](DEBUG.md)

# Good first tasks

Here's some ideas to get started:

* Improve the documentation and testing
* Start modeling the domain entities (Donation Center, Locations, Questions, Campaign ...)
* Define the API Endpoints (/places, /faq, ...)
* Create the main view (map + chat)
* Create the map view
* Create the chat view
* Create the donation center view
* Create more chat utterances and answers

See more features and ideas on [FEATURES.md]
