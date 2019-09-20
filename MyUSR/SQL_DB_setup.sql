DROP TABLE service;

CREATE TABLE service(
	ID	INT,
	customerAccountName VARCHAR(100),
	adminAccountName VARCHAR(100),
	serviceID INT,
	address VARCHAR(100),
	bookingDateTime VARCHAR(100),
	status VARCHAR(100),
	startDate VARCHAR(100),
	endDate VARCHAR(100),
	billAmount INT,
	serviceDescription VARCHAR(100),
	progressDescription VARCHAR(100),
	assignedStaff VARCHAR(100),
	recoveryItems VARCHAR(100),
	itemToDestroy VARCHAR(100),
	itemDestroyed VARCHAR(100),
	serviceType VARCHAR(100),
	PRIMARY KEY (ID)
);

--INSERT INTO service VALUES (1,'admin','admin');