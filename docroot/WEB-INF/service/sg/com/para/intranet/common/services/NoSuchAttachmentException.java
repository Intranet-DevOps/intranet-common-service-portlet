/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package sg.com.para.intranet.common.services;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Fernando Karnagi
 */
public class NoSuchAttachmentException extends NoSuchModelException {

	public NoSuchAttachmentException() {
		super();
	}

	public NoSuchAttachmentException(String msg) {
		super(msg);
	}

	public NoSuchAttachmentException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchAttachmentException(Throwable cause) {
		super(cause);
	}

}