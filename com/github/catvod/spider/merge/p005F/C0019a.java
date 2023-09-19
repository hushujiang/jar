package com.github.catvod.spider.merge.p005F;

/* renamed from: com.github.catvod.spider.merge.F.a */
/* loaded from: classes.dex */
public final class C0019a extends Error {

    /* renamed from: a */
    Exception f89a;

    public C0019a(String str, Exception exc) {
        super(str);
        this.f89a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message == null && (exc = this.f89a) != null) {
            String message2 = exc.getMessage();
            return message2 == null ? this.f89a.getClass().toString() : message2;
        }
        return message;
    }
}
