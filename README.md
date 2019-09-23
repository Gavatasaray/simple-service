#4) Service that posts a JSON to a separate module and a string value is returned.

#3) I have implemented the Spring Retry annotation in the ServiceImpl class. This is how I would go 
#about doing a retry, specifying which errors should be included in a retry and which should be 
#ignored. I have used values passed from the yml file so it is configurable.

#5) Spring boot actuator is used which exposes endpoints like health, info etc.