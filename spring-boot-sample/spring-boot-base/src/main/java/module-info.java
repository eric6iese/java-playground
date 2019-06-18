module whatever.spring.boot.base {

	requires transitive java.sql;
	requires transitive java.persistence;
	requires transitive java.instrument;

	requires transitive org.hibernate.orm.core;

	requires transitive spring.web;
	requires transitive spring.boot.autoconfigure;
	requires transitive spring.boot;
	requires transitive spring.context;
	requires transitive spring.beans;
	requires transitive spring.core;
	requires transitive spring.data.commons;
	requires transitive spring.data.jpa;
	requires transitive spring.data.rest.core;

}