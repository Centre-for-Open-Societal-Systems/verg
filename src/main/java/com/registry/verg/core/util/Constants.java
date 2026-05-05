package com.registry.verg.core.util;


public class Constants{

    public static final String ACTIVE = "ACTIVE";
    public static final String IN_ACTIVE = "INACTIVE";
    public static final String SUCCESSFULLY_CREATED = "successfully created";
    public static final String SUCCESSFULLY_DELETED = "successfully deleted";
    public static final String RESULT = "result";
    public static final String FAILED_CONST = "FAILED";
    public static final String ID = "id";

    public static final String ERROR = "ERROR";
    public static final String REDIS_KEY_PREFIX = "verg_cache_";

    //ES Specific Constants
    public static final String INDEX_TYPE = "_doc";
    public static final String KEYWORD = ".keyword";
    public static final String ASC = "asc";
    public static final String MUST= "must";
    public static final String FILTER= "filter";
    public static final String MUST_NOT="must_not";
    public static final String SHOULD= "should";
    public static final String BOOL="bool";
    public static final String TERM="term";
    public static final String TERMS="terms";
    public static final String MATCH="match";
    public static final String RANGE="range";
    public static final String UNSUPPORTED_QUERY="Unsupported query type";
    public static final String UNSUPPORTED_RANGE= "Unsupported range condition";
    public static final String FACETS = "facets";
    public static final String COUNT = "count";
    public static final String SEARCH_OPERATION_LESS_THAN = "<";
    public static final String SEARCH_OPERATION_GREATER_THAN = ">";
    public static final String SEARCH_OPERATION_LESS_THAN_EQUALS = "<=";
    public static final String SEARCH_OPERATION_GREATER_THAN_EQUALS = ">=";

    public static final String SUCCESSFULLY_READING = "successfully read";
    public static final String ID_NOT_FOUND = "Id not found";
    public static final String INVALID_ID = "Invalid Id";

    public static final String FETCH_RESULT_CONSTANT = ".fetchResult:";
    public static final String URI_CONSTANT = "URI: ";

    public static final String REQUEST_PAYLOAD = "requestPayload";
    public static final String JWT_SECRET_KEY = "demand_search_result";

    public static final String REQUEST_CONSTANT = "Request: ";
    public static final String RESPONSE_CONSTANT = "Response: ";
    public static final String REQUEST = "request";

    public static final String RESPONSE = "response";
    public static final String SUCCESS = "success";
    public static final String FAILED = "Failed";
    public static final String ERROR_MESSAGE = "errmsg";

    // Entity Specific Constants
    public static final String SAMPLE_VALIDATION_FILE_JSON = "/payloadValidation/samplePayloadValidation.json";
    public static final String SAMPLE_ID_RQST = "sampleId";
    public static final String INTEREST_INDEX_NAME = "sampleIndex";

        private Constants() {
    }
}