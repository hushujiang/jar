package com.github.catvod.spider.merge.p021W;

import java.util.Arrays;

/* renamed from: com.github.catvod.spider.merge.W.P */
/* loaded from: classes.dex */
final class C0246P {

    /* renamed from: a */
    private final Object[] f442a;

    /* renamed from: b */
    private final int f443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0246P(Object... objArr) {
        this.f442a = objArr;
        this.f443b = Arrays.hashCode(objArr) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0246P.class == obj.getClass()) {
            return Arrays.deepEquals(this.f442a, ((C0246P) obj).f442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f443b;
    }
}
