package com.danilochaves.project.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id){
        super("Resource Not Found. Id " + id);
    }
}
