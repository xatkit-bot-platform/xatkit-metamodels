/**
 */
package com.xatkit.intent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.xatkit.intent.IntentPackage#getEntityType()
 * @model
 * @generated
 */
public enum EntityType implements Enumerator {
	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "ANY", "any"),

	/**
	 * The '<em><b>DATE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(1, "DATE_TIME", "date-time"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(2, "DATE", "date"),

	/**
	 * The '<em><b>DATE PERIOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_PERIOD(3, "DATE_PERIOD", "date-period"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(4, "TIME", "time"),

	/**
	 * The '<em><b>TIME PERIOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_PERIOD(5, "TIME_PERIOD", "time-period"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(6, "NUMBER", "number"),

	/**
	 * The '<em><b>CARDINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	CARDINAL(7, "CARDINAL", "cardinal"),

	/**
	 * The '<em><b>ORDINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORDINAL(8, "ORDINAL", "ordinal"),

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(9, "INTEGER", "integer"),

	/**
	 * The '<em><b>NUMBER SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_SEQUENCE(10, "NUMBER_SEQUENCE", "number-sequence"),

	/**
	 * The '<em><b>FLIGHT NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIGHT_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	FLIGHT_NUMBER(11, "FLIGHT_NUMBER", "flight-number"),

	/**
	 * The '<em><b>UNIT AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_AREA(12, "UNIT_AREA", "unit-area"),

	/**
	 * The '<em><b>UNIT CURRENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_CURRENCY_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_CURRENCY(13, "UNIT_CURRENCY", "unit-currency"),

	/**
	 * The '<em><b>UNIT LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_LENGTH(14, "UNIT_LENGTH", "unit-length"),

	/**
	 * The '<em><b>UNIT SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_SPEED(15, "UNIT_SPEED", "unit-speed"),

	/**
	 * The '<em><b>UNIT VOLUME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_VOLUME(16, "UNIT_VOLUME", "unit-volume"),

	/**
	 * The '<em><b>UNIT WEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_WEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_WEIGHT(17, "UNIT_WEIGHT", "unit-weight"),

	/**
	 * The '<em><b>UNIT INFORMATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_INFORMATION(18, "UNIT_INFORMATION", "unit-information"),

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE(19, "PERCENTAGE", "percentage"),

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(20, "TEMPERATURE", "temperature"),

	/**
	 * The '<em><b>DURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(21, "DURATION", "duration"),

	/**
	 * The '<em><b>AGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGE(22, "AGE", "age"),

	/**
	 * The '<em><b>ADDRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(23, "ADDRESS", "address"),

	/**
	 * The '<em><b>STREET ADDRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	STREET_ADDRESS(24, "STREET_ADDRESS", "street-address"),

	/**
	 * The '<em><b>ZIP CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	ZIP_CODE(25, "ZIP_CODE", "zip-code"),

	/**
	 * The '<em><b>CAPITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL_VALUE
	 * @generated
	 * @ordered
	 */
	CAPITAL(26, "CAPITAL", "capital"),

	/**
	 * The '<em><b>COUNTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY(27, "COUNTRY", "country"),

	/**
	 * The '<em><b>COUNTRY CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY_CODE(28, "COUNTRY_CODE", "country-code"),

	/**
	 * The '<em><b>CITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_VALUE
	 * @generated
	 * @ordered
	 */
	CITY(29, "CITY", "city"),

	/**
	 * The '<em><b>STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(30, "STATE", "state"),

	/**
	 * The '<em><b>CITY US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_US_VALUE
	 * @generated
	 * @ordered
	 */
	CITY_US(31, "CITY_US", "city-us"),

	/**
	 * The '<em><b>STATE US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_US_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_US(32, "STATE_US", "state-us"),

	/**
	 * The '<em><b>COUNTY US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTY_US_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTY_US(33, "COUNTY_US", "county-us"),

	/**
	 * The '<em><b>CITY GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_GB_VALUE
	 * @generated
	 * @ordered
	 */
	CITY_GB(34, "CITY_GB", "city-gb"),

	/**
	 * The '<em><b>STATE GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_GB_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_GB(35, "STATE_GB", "state-gb"),

	/**
	 * The '<em><b>COUNTY GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTY_GB_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTY_GB(36, "COUNTY_GB", "county-gb"),

	/**
	 * The '<em><b>PLACE ATTRACTION US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION_US_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE_ATTRACTION_US(37, "PLACE_ATTRACTION_US", "place-attraction-us"),

	/**
	 * The '<em><b>PLACE ATTRACTION GB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION_GB_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE_ATTRACTION_GB(38, "PLACE_ATTRACTION_GB", "place-attraction-gb"),

	/**
	 * The '<em><b>PLACE ATTRACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE_ATTRACTION(39, "PLACE_ATTRACTION", "place-attraction"),

	/**
	 * The '<em><b>AIRPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPORT(40, "AIRPORT", "airport"),

	/**
	 * The '<em><b>LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(41, "LOCATION", "location"),

	/**
	 * The '<em><b>EMAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(42, "EMAIL", "email"),

	/**
	 * The '<em><b>PHONE NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE_NUMBER(43, "PHONE_NUMBER", "phone-number"),

	/**
	 * The '<em><b>GIVEN NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVEN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	GIVEN_NAME(44, "GIVEN_NAME", "given-name"),

	/**
	 * The '<em><b>LAST NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_NAME(45, "LAST_NAME", "last-name"),

	/**
	 * The '<em><b>MUSIC ARTIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSIC_ARTIST_VALUE
	 * @generated
	 * @ordered
	 */
	MUSIC_ARTIST(46, "MUSIC_ARTIST", "music-artist"),

	/**
	 * The '<em><b>MUSIC GENRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSIC_GENRE_VALUE
	 * @generated
	 * @ordered
	 */
	MUSIC_GENRE(47, "MUSIC_GENRE", "music-genre"),

	/**
	 * The '<em><b>COLOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR(48, "COLOR", "color"),

	/**
	 * The '<em><b>LANGUAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LANGUAGE(49, "LANGUAGE", "language"),

	/**
	 * The '<em><b>URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL_VALUE
	 * @generated
	 * @ordered
	 */
	URL(50, "URL", "url");

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model literal="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>DATE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @model literal="date-time"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 1;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model literal="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 2;

	/**
	 * The '<em><b>DATE PERIOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_PERIOD
	 * @model literal="date-period"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_PERIOD_VALUE = 3;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model literal="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 4;

	/**
	 * The '<em><b>TIME PERIOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_PERIOD
	 * @model literal="time-period"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_PERIOD_VALUE = 5;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model literal="number"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 6;

	/**
	 * The '<em><b>CARDINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDINAL
	 * @model literal="cardinal"
	 * @generated
	 * @ordered
	 */
	public static final int CARDINAL_VALUE = 7;

	/**
	 * The '<em><b>ORDINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDINAL
	 * @model literal="ordinal"
	 * @generated
	 * @ordered
	 */
	public static final int ORDINAL_VALUE = 8;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model literal="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 9;

	/**
	 * The '<em><b>NUMBER SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_SEQUENCE
	 * @model literal="number-sequence"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_SEQUENCE_VALUE = 10;

	/**
	 * The '<em><b>FLIGHT NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIGHT_NUMBER
	 * @model literal="flight-number"
	 * @generated
	 * @ordered
	 */
	public static final int FLIGHT_NUMBER_VALUE = 11;

	/**
	 * The '<em><b>UNIT AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_AREA
	 * @model literal="unit-area"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_AREA_VALUE = 12;

	/**
	 * The '<em><b>UNIT CURRENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_CURRENCY
	 * @model literal="unit-currency"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_CURRENCY_VALUE = 13;

	/**
	 * The '<em><b>UNIT LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_LENGTH
	 * @model literal="unit-length"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_LENGTH_VALUE = 14;

	/**
	 * The '<em><b>UNIT SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_SPEED
	 * @model literal="unit-speed"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_SPEED_VALUE = 15;

	/**
	 * The '<em><b>UNIT VOLUME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VOLUME
	 * @model literal="unit-volume"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VOLUME_VALUE = 16;

	/**
	 * The '<em><b>UNIT WEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_WEIGHT
	 * @model literal="unit-weight"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_WEIGHT_VALUE = 17;

	/**
	 * The '<em><b>UNIT INFORMATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_INFORMATION
	 * @model literal="unit-information"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_INFORMATION_VALUE = 18;

	/**
	 * The '<em><b>PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE
	 * @model literal="percentage"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_VALUE = 19;

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model literal="temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 20;

	/**
	 * The '<em><b>DURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION
	 * @model literal="duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 21;

	/**
	 * The '<em><b>AGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGE
	 * @model literal="age"
	 * @generated
	 * @ordered
	 */
	public static final int AGE_VALUE = 22;

	/**
	 * The '<em><b>ADDRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS
	 * @model literal="address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 23;

	/**
	 * The '<em><b>STREET ADDRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_ADDRESS
	 * @model literal="street-address"
	 * @generated
	 * @ordered
	 */
	public static final int STREET_ADDRESS_VALUE = 24;

	/**
	 * The '<em><b>ZIP CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP_CODE
	 * @model literal="zip-code"
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_CODE_VALUE = 25;

	/**
	 * The '<em><b>CAPITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL
	 * @model literal="capital"
	 * @generated
	 * @ordered
	 */
	public static final int CAPITAL_VALUE = 26;

	/**
	 * The '<em><b>COUNTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY
	 * @model literal="country"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_VALUE = 27;

	/**
	 * The '<em><b>COUNTRY CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_CODE
	 * @model literal="country-code"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_CODE_VALUE = 28;

	/**
	 * The '<em><b>CITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY
	 * @model literal="city"
	 * @generated
	 * @ordered
	 */
	public static final int CITY_VALUE = 29;

	/**
	 * The '<em><b>STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model literal="state"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 30;

	/**
	 * The '<em><b>CITY US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_US
	 * @model literal="city-us"
	 * @generated
	 * @ordered
	 */
	public static final int CITY_US_VALUE = 31;

	/**
	 * The '<em><b>STATE US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_US
	 * @model literal="state-us"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_US_VALUE = 32;

	/**
	 * The '<em><b>COUNTY US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTY_US
	 * @model literal="county-us"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTY_US_VALUE = 33;

	/**
	 * The '<em><b>CITY GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_GB
	 * @model literal="city-gb"
	 * @generated
	 * @ordered
	 */
	public static final int CITY_GB_VALUE = 34;

	/**
	 * The '<em><b>STATE GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_GB
	 * @model literal="state-gb"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_GB_VALUE = 35;

	/**
	 * The '<em><b>COUNTY GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTY_GB
	 * @model literal="county-gb"
	 * @generated
	 * @ordered
	 */
	public static final int COUNTY_GB_VALUE = 36;

	/**
	 * The '<em><b>PLACE ATTRACTION US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION_US
	 * @model literal="place-attraction-us"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_ATTRACTION_US_VALUE = 37;

	/**
	 * The '<em><b>PLACE ATTRACTION GB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION_GB
	 * @model literal="place-attraction-gb"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_ATTRACTION_GB_VALUE = 38;

	/**
	 * The '<em><b>PLACE ATTRACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_ATTRACTION
	 * @model literal="place-attraction"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_ATTRACTION_VALUE = 39;

	/**
	 * The '<em><b>AIRPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPORT
	 * @model literal="airport"
	 * @generated
	 * @ordered
	 */
	public static final int AIRPORT_VALUE = 40;

	/**
	 * The '<em><b>LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model literal="location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 41;

	/**
	 * The '<em><b>EMAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model literal="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 42;

	/**
	 * The '<em><b>PHONE NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_NUMBER
	 * @model literal="phone-number"
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_NUMBER_VALUE = 43;

	/**
	 * The '<em><b>GIVEN NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVEN_NAME
	 * @model literal="given-name"
	 * @generated
	 * @ordered
	 */
	public static final int GIVEN_NAME_VALUE = 44;

	/**
	 * The '<em><b>LAST NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_NAME
	 * @model literal="last-name"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_NAME_VALUE = 45;

	/**
	 * The '<em><b>MUSIC ARTIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSIC_ARTIST
	 * @model literal="music-artist"
	 * @generated
	 * @ordered
	 */
	public static final int MUSIC_ARTIST_VALUE = 46;

	/**
	 * The '<em><b>MUSIC GENRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSIC_GENRE
	 * @model literal="music-genre"
	 * @generated
	 * @ordered
	 */
	public static final int MUSIC_GENRE_VALUE = 47;

	/**
	 * The '<em><b>COLOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR
	 * @model literal="color"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_VALUE = 48;

	/**
	 * The '<em><b>LANGUAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANGUAGE
	 * @model literal="language"
	 * @generated
	 * @ordered
	 */
	public static final int LANGUAGE_VALUE = 49;

	/**
	 * The '<em><b>URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URL
	 * @model literal="url"
	 * @generated
	 * @ordered
	 */
	public static final int URL_VALUE = 50;

	/**
	 * An array of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityType[] VALUES_ARRAY =
		new EntityType[] {
			ANY,
			DATE_TIME,
			DATE,
			DATE_PERIOD,
			TIME,
			TIME_PERIOD,
			NUMBER,
			CARDINAL,
			ORDINAL,
			INTEGER,
			NUMBER_SEQUENCE,
			FLIGHT_NUMBER,
			UNIT_AREA,
			UNIT_CURRENCY,
			UNIT_LENGTH,
			UNIT_SPEED,
			UNIT_VOLUME,
			UNIT_WEIGHT,
			UNIT_INFORMATION,
			PERCENTAGE,
			TEMPERATURE,
			DURATION,
			AGE,
			ADDRESS,
			STREET_ADDRESS,
			ZIP_CODE,
			CAPITAL,
			COUNTRY,
			COUNTRY_CODE,
			CITY,
			STATE,
			CITY_US,
			STATE_US,
			COUNTY_US,
			CITY_GB,
			STATE_GB,
			COUNTY_GB,
			PLACE_ATTRACTION_US,
			PLACE_ATTRACTION_GB,
			PLACE_ATTRACTION,
			AIRPORT,
			LOCATION,
			EMAIL,
			PHONE_NUMBER,
			GIVEN_NAME,
			LAST_NAME,
			MUSIC_ARTIST,
			MUSIC_GENRE,
			COLOR,
			LANGUAGE,
			URL,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EntityType get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DATE_VALUE: return DATE;
			case DATE_PERIOD_VALUE: return DATE_PERIOD;
			case TIME_VALUE: return TIME;
			case TIME_PERIOD_VALUE: return TIME_PERIOD;
			case NUMBER_VALUE: return NUMBER;
			case CARDINAL_VALUE: return CARDINAL;
			case ORDINAL_VALUE: return ORDINAL;
			case INTEGER_VALUE: return INTEGER;
			case NUMBER_SEQUENCE_VALUE: return NUMBER_SEQUENCE;
			case FLIGHT_NUMBER_VALUE: return FLIGHT_NUMBER;
			case UNIT_AREA_VALUE: return UNIT_AREA;
			case UNIT_CURRENCY_VALUE: return UNIT_CURRENCY;
			case UNIT_LENGTH_VALUE: return UNIT_LENGTH;
			case UNIT_SPEED_VALUE: return UNIT_SPEED;
			case UNIT_VOLUME_VALUE: return UNIT_VOLUME;
			case UNIT_WEIGHT_VALUE: return UNIT_WEIGHT;
			case UNIT_INFORMATION_VALUE: return UNIT_INFORMATION;
			case PERCENTAGE_VALUE: return PERCENTAGE;
			case TEMPERATURE_VALUE: return TEMPERATURE;
			case DURATION_VALUE: return DURATION;
			case AGE_VALUE: return AGE;
			case ADDRESS_VALUE: return ADDRESS;
			case STREET_ADDRESS_VALUE: return STREET_ADDRESS;
			case ZIP_CODE_VALUE: return ZIP_CODE;
			case CAPITAL_VALUE: return CAPITAL;
			case COUNTRY_VALUE: return COUNTRY;
			case COUNTRY_CODE_VALUE: return COUNTRY_CODE;
			case CITY_VALUE: return CITY;
			case STATE_VALUE: return STATE;
			case CITY_US_VALUE: return CITY_US;
			case STATE_US_VALUE: return STATE_US;
			case COUNTY_US_VALUE: return COUNTY_US;
			case CITY_GB_VALUE: return CITY_GB;
			case STATE_GB_VALUE: return STATE_GB;
			case COUNTY_GB_VALUE: return COUNTY_GB;
			case PLACE_ATTRACTION_US_VALUE: return PLACE_ATTRACTION_US;
			case PLACE_ATTRACTION_GB_VALUE: return PLACE_ATTRACTION_GB;
			case PLACE_ATTRACTION_VALUE: return PLACE_ATTRACTION;
			case AIRPORT_VALUE: return AIRPORT;
			case LOCATION_VALUE: return LOCATION;
			case EMAIL_VALUE: return EMAIL;
			case PHONE_NUMBER_VALUE: return PHONE_NUMBER;
			case GIVEN_NAME_VALUE: return GIVEN_NAME;
			case LAST_NAME_VALUE: return LAST_NAME;
			case MUSIC_ARTIST_VALUE: return MUSIC_ARTIST;
			case MUSIC_GENRE_VALUE: return MUSIC_GENRE;
			case COLOR_VALUE: return COLOR;
			case LANGUAGE_VALUE: return LANGUAGE;
			case URL_VALUE: return URL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EntityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EntityType
