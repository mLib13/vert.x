/*
 * Copyright (c) 2011-2013 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.benchmarks;

import io.netty.handler.codec.http.HttpHeaders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public abstract class HeadersUtils {

  public static final DateFormat DATE_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyyy HH:mm:ss z");
  public static final CharSequence VERTX_HEADER = io.vertx.core.http.HttpHeaders.createOptimized("vert.x");
  public static final CharSequence TEXT_PLAIN_HEADER = io.vertx.core.http.HttpHeaders.createOptimized("text/plain");
  public static final CharSequence CONTENT_LENGTH_HEADER = io.vertx.core.http.HttpHeaders.createOptimized("20");
  public static final CharSequence DATE_HEADER = io.vertx.core.http.HttpHeaders.createOptimized(DATE_FORMAT.format(new Date()));

  public static void setBaseHeaders(HttpHeaders headers) {
    headers.add(io.vertx.core.http.HttpHeaders.CONTENT_TYPE, TEXT_PLAIN_HEADER);
    headers.add(io.vertx.core.http.HttpHeaders.CONTENT_LENGTH, CONTENT_LENGTH_HEADER);
    headers.add(io.vertx.core.http.HttpHeaders.SERVER, VERTX_HEADER);
    headers.add(io.vertx.core.http.HttpHeaders.DATE, DATE_HEADER);
  }
}
