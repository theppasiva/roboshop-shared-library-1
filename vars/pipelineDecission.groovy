#!groovy

def decidePipeline(Map configMap){
    application = configMap.get("application")
switch(application) {
  case 'nodejsVM':
    nodejsVM(configMap)
    break
  case 'javaVM':
    nodejsVM(configMap)
    break
  case 'nodejsEKS':
    nodejsVM(configMap)
    break
  default:
    error "Application is not recognised"
    break
}
}
