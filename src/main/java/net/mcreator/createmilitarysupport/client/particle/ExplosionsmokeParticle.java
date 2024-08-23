
package net.mcreator.createmilitarysupport.client.particle;

@OnlyIn(Dist.CLIENT)
public class ExplosionsmokeParticle extends TextureSheetParticle {
	public static ExplosionsmokeParticleProvider provider(SpriteSet spriteSet) {
		return new ExplosionsmokeParticleProvider(spriteSet);
	}

	public static class ExplosionsmokeParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public ExplosionsmokeParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new ExplosionsmokeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected ExplosionsmokeParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize *= 5f;
		this.lifetime = (int) Math.max(1, 300 + (this.random.nextInt(600) - 300));
		this.gravity = -0.05f;
		this.hasPhysics = false;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
	}
}