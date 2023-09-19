package com.github.catvod.spider.merge.p020V;

import com.github.catvod.spider.merge.atm;
import java.io.Writer;

@Deprecated
/* renamed from: com.github.catvod.spider.merge.V.g */
/* loaded from: classes.dex */
public final class C0225g extends AbstractC0221c {

    /* renamed from: b */
    private final int f405b;

    /* renamed from: c */
    private final int f406c;

    private C0225g(int i, int i2) {
        this.f405b = i;
        this.f406c = i2;
    }

    /* renamed from: c */
    public static C0225g m1112c(int i, int i2) {
        return new C0225g(i, i2);
    }

    @Override // com.github.catvod.spider.merge.p020V.AbstractC0221c
    /* renamed from: b */
    public final boolean mo1109b(int i, Writer writer) {
        if (i < this.f405b || i > this.f406c) {
            return false;
        }
        writer.write(atm.m897d("4C59"));
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
