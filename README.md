# CAS765 StepCount and Indoor Location
Implement an Android app to realize the indoor location at ITB of Mcmaster University. This application includes two parts, one is a walking tracker and the other one is a wifi locator. The principle of the walking tracker is combining a step counter, a compass, step length together to draw the walking track of users. We developed the step counter  in the following procedures: collected data from accelerate sensor, then created and implement an algorithm to analyze the data and detect every step. The compass was realized by using orientation sensor to get users' walking direction. The step length was calculated according to the data of z axis in accelerate sensor. As for wifi locator, we got the strength of signal from every router and compared it with our list to get a position.