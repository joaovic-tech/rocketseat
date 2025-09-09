import Image from "next/image";

const customerStories = [
  {
    content:
      "Criar minha loja com o site.set foi a melhor decisão para o meu negócio. A plataforma é super intuitiva, e consegui colocar meus produtos à venda em poucos minutos.",
    author: {
      name: "Annette Bones",
      role: "CEO na Anne Corp",
      avatar: "/customer-01.png",
    },
  },
  {
    content:
      "Transformar minha ideia em uma loja online foi fácil e rápido. Adorei as opções de personalização e a simplicidade para gerenciar os pedidos. Já vejo meus produtos alcançando mais pessoas!",
    author: {
      name: "Jacob Jones",
      role: "CEO na JJ Org",
      avatar: "/customer-02.png",
    },
  },
];

export const CustomerStorySection = () => {
  return (
    <section className="container py-8 md:py-10">
      <div className="flex flex-col items-center gap-12">
        <h2 className="text-heading-lg text-gray-100 font-sans">
          Quem utiliza, aprova!
        </h2>

        <div className="grid gap-8 md:grid-cols-2">
          {customerStories.map((customerStory, index) => (
            <div
              key={index}
              className="flex flex-col gap-6 rounded-lg bg-gray-600 p-6 md:p-12 border border-gray-400"
            >
              <p className="text-gray-200 text-balance">
                {customerStory.content}
              </p>

              <div className="flex items-center gap-3">
                <div className="relative h-10 w-10 overflow-hidden rounded-full">
                  <Image
                    src={customerStory.author.avatar}
                    alt={customerStory.author.name}
                    fill
                    className="rounded-full"
                  />
                </div>

                <div className="flex flex-col">
                  <strong className="text-gray-200 text-sm">
                    {customerStory.author.name}
                  </strong>
                  <span className="text-gray-300 text-xs">
                    {customerStory.author.role}
                  </span>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
};
