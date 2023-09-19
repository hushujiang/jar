package com.github.catvod.spider.merge.p011L;

import com.github.catvod.spider.merge.p007H.AbstractC0040l;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.L.b */
/* loaded from: classes.dex */
public final class C0055b extends AbstractC0040l {

    /* renamed from: a */
    private final int f102a;

    /* renamed from: b */
    private boolean f103b;

    /* renamed from: c */
    private int f104c;

    /* renamed from: d */
    private final int f105d;

    public C0055b(int i, int i2, int i3) {
        this.f105d = i3;
        this.f102a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f103b = z;
        this.f104c = z ? i : i2;
    }

    @Override // com.github.catvod.spider.merge.p007H.AbstractC0040l
    /* renamed from: b */
    public final int mo1400b() {
        int i = this.f104c;
        if (i != this.f102a) {
            this.f104c = this.f105d + i;
        } else if (!this.f103b) {
            throw new NoSuchElementException();
        } else {
            this.f103b = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f103b;
    }
}
