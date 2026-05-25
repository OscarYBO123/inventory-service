package com.example.inventoryservice.exception;

public class ResourceNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2150578218540250568L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}