package com.github.catvod.spider.merge.p013N;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0653a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* renamed from: com.github.catvod.spider.merge.N.e */
/* loaded from: classes.dex */
public final class C0080e {

    /* renamed from: b */
    private ByteBuffer f123b;

    /* renamed from: a */
    private int f122a = 1;

    /* renamed from: c */
    private CharBuffer f124c = null;

    /* renamed from: d */
    private IntBuffer f125d = null;

    /* renamed from: e */
    private int f126e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0080e(int i) {
        this.f123b = ByteBuffer.allocate(i);
    }

    /* renamed from: b */
    private void m1378b(CharBuffer charBuffer) {
        char[] array = charBuffer.array();
        int position = charBuffer.position() + charBuffer.arrayOffset();
        int limit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] array2 = this.f124c.array();
        int position2 = this.f124c.position() + this.f124c.arrayOffset();
        while (position < limit) {
            char c = array[position];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(position - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.f124c;
                charBuffer2.position(position2 - charBuffer2.arrayOffset());
                int remaining = charBuffer.remaining();
                this.f124c.flip();
                IntBuffer allocate = IntBuffer.allocate(Math.max(this.f124c.remaining() + remaining, this.f124c.capacity() / 2));
                while (this.f124c.hasRemaining()) {
                    allocate.put(this.f124c.get() & 65535);
                }
                this.f122a = 3;
                this.f124c = null;
                this.f125d = allocate;
                m1377c(charBuffer);
                return;
            }
            array2[position2] = c;
            position++;
            position2++;
        }
        charBuffer.position(position - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.f124c;
        charBuffer3.position(position2 - charBuffer3.arrayOffset());
    }

    /* renamed from: c */
    private void m1377c(CharBuffer charBuffer) {
        char[] array = charBuffer.array();
        int position = charBuffer.position() + charBuffer.arrayOffset();
        int limit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] array2 = this.f125d.array();
        int position2 = this.f125d.position() + this.f125d.arrayOffset();
        while (true) {
            int i = -1;
            if (position >= limit) {
                break;
            }
            char c = array[position];
            position++;
            if (this.f126e != -1) {
                if (Character.isLowSurrogate(c)) {
                    array2[position2] = Character.toCodePoint((char) this.f126e, c);
                } else {
                    array2[position2] = this.f126e;
                    position2++;
                    if (!Character.isHighSurrogate(c)) {
                        array2[position2] = 65535 & c;
                    }
                }
                position2++;
                this.f126e = i;
            } else if (!Character.isHighSurrogate(c)) {
                array2[position2] = c & 65535;
                position2++;
            }
            i = c & 65535;
            this.f126e = i;
        }
        int i2 = this.f126e;
        if (i2 != -1) {
            array2[position2] = i2 & 65535;
            position2++;
        }
        charBuffer.position(position - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.f125d;
        intBuffer.position(position2 - intBuffer.arrayOffset());
    }

    /* renamed from: e */
    private static int m1375e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: a */
    public final void m1379a(CharBuffer charBuffer) {
        int remaining = charBuffer.remaining();
        int m139a = C0653a.m139a(this.f122a);
        if (m139a != 0) {
            if (m139a != 1) {
                if (m139a == 2 && this.f125d.remaining() < remaining) {
                    IntBuffer allocate = IntBuffer.allocate(m1375e(this.f125d.capacity() + remaining));
                    this.f125d.flip();
                    allocate.put(this.f125d);
                    this.f125d = allocate;
                }
            } else if (this.f124c.remaining() < remaining) {
                CharBuffer allocate2 = CharBuffer.allocate(m1375e(this.f124c.capacity() + remaining));
                this.f124c.flip();
                allocate2.put(this.f124c);
                this.f124c = allocate2;
            }
        } else if (this.f123b.remaining() < remaining) {
            ByteBuffer allocate3 = ByteBuffer.allocate(m1375e(this.f123b.capacity() + remaining));
            this.f123b.flip();
            allocate3.put(this.f123b);
            this.f123b = allocate3;
        }
        if (charBuffer.hasArray()) {
            int m139a2 = C0653a.m139a(this.f122a);
            if (m139a2 != 0) {
                if (m139a2 == 1) {
                    m1378b(charBuffer);
                    return;
                } else if (m139a2 != 2) {
                    return;
                } else {
                    m1377c(charBuffer);
                    return;
                }
            }
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            byte[] array2 = this.f123b.array();
            int position2 = this.f123b.position() + this.f123b.arrayOffset();
            while (position < limit) {
                char c = array[position];
                if (c > 255) {
                    charBuffer.position(position - charBuffer.arrayOffset());
                    ByteBuffer byteBuffer = this.f123b;
                    byteBuffer.position(position2 - byteBuffer.arrayOffset());
                    if (!Character.isHighSurrogate(c)) {
                        int remaining2 = charBuffer.remaining();
                        this.f123b.flip();
                        CharBuffer allocate4 = CharBuffer.allocate(Math.max(this.f123b.remaining() + remaining2, this.f123b.capacity() / 2));
                        while (this.f123b.hasRemaining()) {
                            allocate4.put((char) (this.f123b.get() & 255));
                        }
                        this.f122a = 2;
                        this.f123b = null;
                        this.f124c = allocate4;
                        m1378b(charBuffer);
                        return;
                    }
                    int remaining3 = charBuffer.remaining();
                    this.f123b.flip();
                    IntBuffer allocate5 = IntBuffer.allocate(Math.max(this.f123b.remaining() + remaining3, this.f123b.capacity() / 4));
                    while (this.f123b.hasRemaining()) {
                        allocate5.put(this.f123b.get() & 255);
                    }
                    this.f122a = 3;
                    this.f123b = null;
                    this.f125d = allocate5;
                    m1377c(charBuffer);
                    return;
                }
                array2[position2] = (byte) (c & 255);
                position++;
                position2++;
            }
            charBuffer.position(position - charBuffer.arrayOffset());
            ByteBuffer byteBuffer2 = this.f123b;
            byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
            return;
        }
        throw new UnsupportedOperationException(atm.m897d("3E353E3A"));
    }

    /* renamed from: d */
    public final C0081f m1376d() {
        int m139a = C0653a.m139a(this.f122a);
        if (m139a == 0) {
            this.f123b.flip();
        } else if (m139a == 1) {
            this.f124c.flip();
        } else if (m139a == 2) {
            this.f125d.flip();
        }
        return new C0081f(this.f122a, this.f123b, this.f124c, this.f125d);
    }
}
