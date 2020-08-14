package com.github.JunitInAction.Chapter8.WebClientRefactor;

import java.io.InputStream;

public interface ConnectionFactory {
    InputStream getData() throws Exception;
}
