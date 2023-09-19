package com.github.catvod.spider.merge.p023Y;

import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.Y.d */
/* loaded from: classes.dex */
public final class C0278d extends IllegalArgumentException {

    /* renamed from: a */
    public static final String f503a = C0277c.class.getName();

    public C0278d(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(f503a)) {
                arrayList.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        return this;
    }
}
