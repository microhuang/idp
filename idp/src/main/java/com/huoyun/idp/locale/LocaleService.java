package com.huoyun.idp.locale;

public interface LocaleService {

	String getMessage(String key);

	String getErrorMessage(String errorCode);

	String getMessage(String key, Object[] objs);
}
